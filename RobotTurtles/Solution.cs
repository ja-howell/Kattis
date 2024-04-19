using System.Collections.Generic;

namespace RobotTurtles
{

    public class Solution
    {
        enum Direction
        {
            North,
            East,
            South,
            West
        }
        public string TurtlesBFS(char[][] board)
        {
            Dictionary<State, State> cameFrom = new Dictionary<State, State>();
            Queue<State> frontier = new Queue<State>();
            Position position = new Position(7, 0);
            State start = new State(position, Direction.East, IsFacingIceCastle(board, position, Direction.East));
            cameFrom[start] = start;
            frontier.Enqueue(start);
            while (frontier.Count > 0)
            {
                // Console.WriteLine($"There are {frontier.Count} states remaining");
                State u = frontier.Dequeue();
                // Console.WriteLine($"Examining state {u}");
                if (board[u.position.row][u.position.col] == 'D')
                {
                    return BuildTurtlePath(cameFrom, u);
                }

                List<State> states = GetNextStates(board, u);
                foreach (var v in states)
                {
                    // Console.WriteLine($"Examining neighbor {v}");
                    if (!cameFrom.ContainsKey(v))
                    {
                        // Console.WriteLine($"Visited the following for the first time: {v}");

                        frontier.Enqueue(v);
                        cameFrom[v] = u;
                    }
                }
            }
            return "no solution";
        }

        private static List<State> GetNextStates(char[][] board, State state)
        {
            List<State> states = new List<State>();

            Position position = GetNewPosition(state.position, state.dir);
            if (IsInbounds(position.row, position.col, board))
            {
                if (state.iceCastle)
                {
                    states.Add(new State(state.position, state.dir, false));
                }
                else if (board[position.row][position.col] != 'C')
                {
                    states.Add(new State(position, state.dir, IsFacingIceCastle(board, position, state.dir)));
                }
            }

            if (state.dir == Direction.North || state.dir == Direction.South)
            {
                states.Add(new State(state.position, Direction.East, IsFacingIceCastle(board, state.position, Direction.East)));
                states.Add(new State(state.position, Direction.West, IsFacingIceCastle(board, state.position, Direction.West)));
            }
            else
            {
                states.Add(new State(state.position, Direction.North, IsFacingIceCastle(board, state.position, Direction.North)));
                states.Add(new State(state.position, Direction.South, IsFacingIceCastle(board, state.position, Direction.South)));
            }

            return states;
        }

        private static bool IsInbounds(int row, int col, char[][] board)
        {
            return 0 <= row && row < board.Length && 0 <= col && col < board[0].Length;
        }

        private static bool IsFacingIceCastle(char[][] board, Position position, Direction dir)
        {
            Position newPosition = GetNewPosition(position, dir);
            if (IsInbounds(newPosition.row, newPosition.col, board))
            {
                return board[newPosition.row][newPosition.col] == 'I';
            }
            return false;
        }

        private static Position GetNewPosition(Position position, Direction dir)
        {
            int candidateRow = position.row;
            int candidateCol = position.col;
            switch (dir)
            {
                case Direction.West:
                    candidateCol = position.col - 1;
                    break;
                case Direction.East:
                    candidateCol = position.col + 1;
                    break;
                case Direction.North:
                    candidateRow = position.row - 1;
                    break;
                case Direction.South:
                    candidateRow = position.row + 1;
                    break;
            }
            return new Position(candidateRow, candidateCol);
        }

        private static string BuildTurtlePath(Dictionary<State, State> cameFrom, State u)
        {
            string path = "";
            while (cameFrom[u] != u)
            {
                if (u.position.row != cameFrom[u].position.row || u.position.col != cameFrom[u].position.col)
                {
                    path = 'F' + path;
                }
                else if (u.dir != cameFrom[u].dir)
                {
                    path = CalculateDirectionChange(u, cameFrom[u]) + path;
                }
                else
                {
                    path = 'X' + path;
                }
                u = cameFrom[u];
            }
            return path;
        }

        private static char CalculateDirectionChange(State child, State parent)
        {
            if (child.dir == Direction.North)
            {
                if (parent.dir == Direction.East)
                {
                    return 'L';
                }
                return 'R';
            }
            else if (child.dir == Direction.South)
            {
                if (parent.dir == Direction.West)
                {
                    return 'L';
                }
                return 'R';
            }
            else if (child.dir == Direction.East)
            {
                if (parent.dir == Direction.South)
                {
                    return 'L';
                }
                return 'R';
            }
            else
            {
                if (parent.dir == Direction.North)
                {
                    return 'L';
                }
                return 'R';
            }
        }

        private class State
        {
            public State(Position position, Direction dir, bool iceCastle)
            {
                this.position = position;
                this.dir = dir;
                this.iceCastle = iceCastle;
            }
            public Position position { get; set; }
            public Direction dir { get; set; }
            public bool iceCastle { get; set; }

            public override bool Equals(object obj)
            {
                if (obj == null || GetType() != obj.GetType())
                    return false;

                State other = (State)obj;
                return position.row == other.position.row &&
                position.col == other.position.col &&
                       dir == other.dir &&
                       iceCastle == other.iceCastle;
            }

            public override int GetHashCode()
            {
                unchecked
                {
                    int hash = (position.row * 1000) +
                    (position.col * 100) +
                    ((int)dir * 10) +
                    (iceCastle ? 1 : 0);
                    return hash;
                }
            }

            public override string ToString()
            {
                return $"{this.position.row}, {this.position.col}, {this.dir}, {this.iceCastle}, {this.GetHashCode()}";
            }

        }

        private class Position
        {
            public Position(int row, int col)
            {
                this.row = row;
                this.col = col;
            }
            public int row { get; set; }
            public int col { get; set; }
        }
    }
}