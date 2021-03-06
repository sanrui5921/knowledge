__author__ = 'qichao'

from urllib import request, error

# 访问明显不存在的地址，报错：Not Found
try:
    response = request.urlopen('http://www.geekdigging.com/aa')
except error.URLError as e:
    print(e.reason)

# 访问超时，报错：timed out
try:
    response = request.urlopen('http://www.baidu.com', timeout=0.001)
except error.URLError as e:
    print(e.reason)
