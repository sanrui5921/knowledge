__author__ = 'qichao'

# 鸢尾花识别是一个经典的机器学习分类问题，它的数据样本中包括了4个特征变量，1个类别变量，样本总数为150。

# 它的目标是为了根据花萼长度（sepal length）、花萼宽度（sepal width）、花瓣长度（petal length）、花瓣宽度（petal width）

# 这四个特征来识别出鸢尾花属于山鸢尾（iris-setosa）、变色鸢尾（iris-versicolor）和维吉尼亚鸢尾（iris-virginica）中的哪一种。

# 引入数据集，sklearn包含众多数据集
from sklearn import datasets
# 将数据分为测试集和训练集
from sklearn.model_selection import train_test_split
# 利用邻近点方式训练数据
from sklearn.neighbors import KNeighborsClassifier

# 引入数据,本次导入鸢尾花数据，iris数据包含4个特征变量
iris = datasets.load_iris()
# 特征变量
iris_X = iris.data
print("###########################iris_X########################")
print(iris_X)
print("###########################iris_X end########################")
print('特征变量的长度', len(iris_X))
# 目标值
iris_y = iris.target
print('鸢尾花的目标值', iris_y)
# 利用train_test_split进行训练集和测试机进行分开，test_size占30%
X_train, X_test, y_train, y_test = train_test_split(iris_X, iris_y, test_size=0.3)
# 我们看到训练数据的特征值分为3类
print("###########################X_train########################")
print(X_train)
print("###########################X_train end########################")

print("###########################y_train########################")
print(y_train)
print("###########################y_train end########################")

print("###########################X_test########################")
print(X_test)
print("###########################X_test end########################")

print("###########################y_test########################")
print(y_test)
print("###########################y_test end########################")

# 训练数据
# 引入训练方法
knn = KNeighborsClassifier()
# 进行填充测试数据进行训练
knn.fit(X_train, y_train)

params = knn.get_params()

print("###########################y_test########################")
print(params)
print("###########################y_test########################")

score = knn.score(X_test, y_test)
print("###########################y_test########################")
print("预测得分为：%s" % score)
print("###########################y_test########################")
print("###########################knn.predict(X_test)########################")
print(knn.predict(X_test))
print("###########################knn.predict(X_test) end########################")

print("###########################y_test########################")
print(y_test)
print("###########################y_test end########################")
