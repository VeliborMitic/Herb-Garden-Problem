# Herb Garden Problem

You love cooking with fresh herbs, so you've been trying to grow an herb garden at home!  
Every day you harvest one of your plants, removing half of its leaves (rounded down), and every night, each of the plants grows 2 new leaves.  
Given plants, an array of integers representing the number of leaves on each plant, your task is to determine the maximum number of leaves you can harvest in total, over the course of a given number of days (represented by the integer days).

# Example  
For plants = [2, 7, 5, 3] and days = 3,  the output should be herbGarden(plants, days) = 10.

The maximum total number of leaves that can be harvested over the course of 3 days is 10.  
Here's one way to do it:

Plants before harvesting &emsp;Plant to harvest &emsp;Plants after harvesting &emsp;Total leaves harvested  
&emsp;&emsp;[2, 7, 5, 3]&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;1&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;[2, 4, 5, 3]&emsp;&emsp;&emsp;3  
&emsp;&emsp;[4, 6, 7, 5]&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;2&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;[4, 6, 4, 5]&emsp;&emsp;&emsp;6  
&emsp;&emsp;[6, 8, 6, 7]&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;1&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;[6, 4, 6, 7]&emsp;&emsp;&emsp;10  

# Input / Output

<h4>[input] array.integer plants</h4>An array of integers representing the initial number of leaves on each plant.

<h5>Guaranteed constraints:</h5>1 ≤ plants.length ≤ 10  
0 ≤ plants[i] ≤ 10  

<h4>[input] integer days</h4>An integer representing the number of days over which we're trying to maximize the number of total leaves we can collect.  
This is also equal to the number of times you'll harvest a plant, since you harvest one each day.

<h5>Guaranteed constraints:</h5>1 ≤ days ≤ 100

<h4>[output] integer</h4>An integer representing the maximum total number of leaves you can harvest in the given number of days.