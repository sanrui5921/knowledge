__author__ = 'qichao'

from sklearn import datasets
import sys

iris = datasets.load_iris()  # 导入数据集
X = iris.data  # 获得其特征向量
y = iris.target  # 获得样本label

print(sys.path)