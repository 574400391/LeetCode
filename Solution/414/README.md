## 题目描述：第三大的数
给定一个非空数组，返回此数组中第三大的数。如果不存在，则返回数组中最大的数。要求算法时间复杂度必须是O(n)。

## 思路：
常规的思路需要对数组进行排序、去重后判断最大的值或者第三大的值，反而是绕远了。直接定义三个值来遍历数组获取当前数组的前三个最大数