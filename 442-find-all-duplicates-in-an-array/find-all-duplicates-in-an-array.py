class Solution(object):
    def findDuplicates(self, nums):
        hs = set()
        res = []
        for i in nums:
            if i in hs:
                res.append(i)
            else:
                hs.add(i)
        return res