

# Rotate and Speak Game
N children are playing a game of Rotate and Speak. In this game all the children are given a number plate which contains distinct values and they need to form a circle in clockwise order.
There are Q turns in this game. In each turn two numbers a and b are announced. The rules of the game are as follows :
1.	If the number a is equal to 1 then it means that all the children shift b steps in anti clockwise direction.
2.	If the number a is equal to 2 then it means that all the children shift b steps in clockwise direction.
3.	If the number a is equal to 3 then it means that the child who is standing at  position b in the clockwise order speaks the number on his number plate. Note that the positions are from 0 to N−1 not 1 to N

# Input format:
First line contains an intege T that denotes the number of test cases

First line in every test case contains an integer N denoting the count of children playing the game.

Second line in every test case contains N space separated integers , here the ith integer is the number on the number plate of the student i

Third line in every test case contains an integer Q,number of turns in the game.

Following Q lines ,each contain two integers describing one of the 3 types of moves in a turn.

# Output format:

For each moves of type 3, you have to print the number that will be spoken in that turn of the game.

Constraints:
1≤T≤20
1≤N,Q≤105
1≤a≤3
0≤b≤N−1

Note- Since input files are large, use fast input/output methods.
# Sample Input
1

3

2 1 3

5

3 2

1 1

3 2

2 2

3 2

# Sample Output
3
2
1

# Explanation
 
task 1: number plate of  2nd child = 3.
task 2: rotate the circle 1 step anticlockwise, the arrangement becomes {1,3,2}.
 
task 3: number plate of 2nd child = 2.
taks 4: rotate the circle 2 steps towards right , the arrangement becomes {3,2,1}.
 
task 5: number plate of 2nd child = 1.

