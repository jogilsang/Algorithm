class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        # 1. m 이나 n이 0이면 합치지않는다
        # 2. 0이 아닌것들을 합친다
        # 3. 최종배열을 정렬한다
        """
        nums3 = nums1[:]
        nums1[:] = []

        if m > 0:
            for num in nums3[:m]:
                nums1.append(num)

        if n > 0:
            for num in nums2[:n]:
                nums1.append(num)

        nums1.sort()