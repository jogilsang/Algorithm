class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        # 1. m 이나 n이 0이면 합치지않는다
        # 2. 0이 아닌것들을 합친다
        # 3. 최종배열을 정렬한다
        """

        nums1[:] = nums1[:m]
        nums2[:] = nums2[:n]

        nums1[:] = nums1[:] + nums2[:]

        nums1.sort()