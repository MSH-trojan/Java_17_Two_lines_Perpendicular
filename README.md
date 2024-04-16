Write a Java code that asks the user to enter the integer (x, y) coordinates of two points that form a straight line, reads these coordinates, and calculate the slope (a) and the slope-intercept (b) that form the equation of the straight line as follows:
y = ax + b
a = (y2 - y1)/(x2 - x1)
b = y2 - a*x2
Then ask the user to enter the integer (xA, yA) coordinate of a point A, read this data, and calculate the distance from this point A to the above straight line:
Then you need to get the equation of the line that passes through A and is perpendicular to the original one as follows: The slope of the perpendicular line (aP) is the negative inverse of the slope of the original line:
aP = -1/a
The slope-intercept (bP) of the perpendicular line is calculated by replacing the coordinates of point A into the equation:
𝑏𝑃=𝑦𝐴−𝑎𝑃𝑥𝐴
Once you get the equation of the perpendicular line, you need to calculate the coordinates (xI, yI) of the intersection point between the original line and the perpendicular one as follows. 𝑥𝐼=𝑏𝑃−𝑏𝑎−𝑎𝑃 𝑦𝐼=𝑎𝑥𝐼+𝑏
Lastly, get the distance as follows: 𝑑𝑖𝑠𝑡𝑎𝑛𝑐𝑒=√(𝑥𝐴−𝑥𝐼)^2+(𝑦𝐴−𝑦𝐼)^2
