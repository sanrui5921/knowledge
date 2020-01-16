__author__ = 'qichao'

from sklearn import linear_model

import matplotlib.pyplot as plt

clf = linear_model.LinearRegression()

X = [[0, 0], [1, 1], [2, 2]]

X1 = [0, 1, 2]

y = [0, 1, 2]

plt.scatter(X1, y)

print(clf.fit(X, y))

print(clf.coef_)

plt.plot(X, clf.predict(X))

plt.show()
