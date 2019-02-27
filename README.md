# Herb Garden Problem

You love cooking with fresh herbs, so you've been trying to grow an herb garden at home! Every day you harvest one of your plants, removing half of its leaves (rounded down), and every night, each of the plants grows 2 new leaves.
Given plants, an array of integers representing the number of leaves on each plant, your task is to determine the maximum number of leaves you can harvest in total, over the course of a given number of days (represented by the integer days).

# Example

For plants = [2, 7, 5, 3] and days = 3, the output should be herbGarden(plants, days) = 10.

The maximum total number of leaves that can be harvested over the course of 3 days is 10. Here's one way to do it:

plants before harvesting 	 plant to harvest 	 plants after harvesting 	 total leaves harvested
[2, 7, 5, 3]	1	[2, 4, 5, 3]	3
[4, 6, 7, 5]	2	[4, 6, 4, 5]	6
[6, 8, 6, 7]	1	[6, 4, 6, 7]	10
Input / Output

[input] array.integer plants - An array of integers representing the initial number of leaves on each plant.

Guaranteed constraints:
1 ≤ plants.length ≤ 10
0 ≤ plants[i] ≤ 104

[input] integer days - An integer representing the number of days over which we're trying to maximize the number of total leaves we can collect. This is also equal to the number of times you'll harvest a plant, since you harvest one each day.

Guaranteed constraints:
1 ≤ days ≤ 100

[output] integer - An integer representing the maximum total number of leaves you can harvest in the given number of days.