__author__ = 'qichao'

import numpy as np
import matplotlib.pyplot as plt

x = np.linspace(-10, 10, 200)

y = x * x

y1 = x * 2 + 1

plt.plot(x, y, label='First Line')

plt.plot(x, y1, label='Second Line')

plt.xlabel('Plot Number')

plt.ylabel('Important var')

plt.show()
