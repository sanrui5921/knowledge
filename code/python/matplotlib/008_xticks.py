__author__ = 'qichao'

import numpy as np
import matplotlib.pyplot as plt
import calendar

x = range(1, 13, 1)
y = range(1, 13, 1)
plt.plot(x, y)
# plt.xticks(x)
# plt.xticks(x, ('Tom', 'Dick', 'Harry', 'Sally', 'Sue', 'Lily', 'Ava', 'Isla', 'Rose', 'Jack', 'Leo', 'Charlie'))
#plt.xticks(x, calendar.month_name[1:13], color='blue', rotation=60)

plt.xticks(x)
plt.yticks(y)
plt.show()
