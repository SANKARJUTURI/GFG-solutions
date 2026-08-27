<h2><a href="https://www.geeksforgeeks.org/problems/search-query-for-strings5049/1">Search Query for Strings</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p><span style="font-size: 18px;">A Trie (Prefix Tree) is an efficient data structure used for storing and searching strings, especially when dealing with prefixes.</span></p>
<p><span style="font-size: 18px;">You are given an array of strings <strong>arr[]</strong> of size <strong>n</strong> containing only lowercase English letters, and an array of query strings <strong>queries[]</strong> of size <strong>q</strong>. An empty TrieNode* root is provided as the root of the Trie.</span></p>
<p><span style="font-size: 18px;">Insert all strings from<strong> arr[]</strong> into the Trie and, for each query string, check whether it exists in the Trie.</span></p>
<p><span style="font-size: 18px;">For every query, return 1 if the string exists in arr[]; otherwise, return 0.&nbsp; &nbsp; &nbsp; &nbsp; </span></p>
<p><span style="font-size: 18px;"><strong>Note:</strong> The required Trie functions are already implemented in the driver code. You only need to call them.</span><span style="font-size: 18px;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;</span></p>
<p><strong><span style="font-size: 18px;">Examples:</span></strong></p>
<pre><strong><span style="font-size: 18px;">Input: </span></strong><span style="font-size: 18px;">arr[] = ["the", "there", "any", "by", "their"], queries[] = ["the", "an", "any"]
<strong>Output: </strong>[1, 0, 1]<strong>
Explanation: <br></strong>After inserting all strings from words[] into the Trie:
"the" is present in the Trie, so the answer is 1.
"an" is not present as a complete word, so the answer is 0.
"any" exists in the Trie, so the answer is 1.
Hence, the output is [1, 0, 1].</span>
</pre>
<pre><strong><span style="font-size: 18px;">Input: </span></strong><span style="font-size: 18px;">arr[] = ["cat", "car", "dog", "door"], queries[] = ["car", "dog", "do"]
</span><strong style="font-size: 18px;">Output: </strong><span style="font-size: 18px;">[1, 1, 0]</span><strong style="font-size: 18px;">
Explanation: <br></strong><span style="font-size: 18px;">After inserting all strings from words[] into the Trie:
"car" is present in the Trie, so the answer is 1.
"dog" is present as a complete word, so the answer is 1.
"do" exists in the Trie, so the answer is 0.
Hence, the output is [1, 1, 0].</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ n ≤ 10<sup>3</sup><br>1 ≤ q ≤ 10<sup>3</sup></span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Strings</code>&nbsp;<code>Trie</code>&nbsp;<code>Advanced Data Structure</code>&nbsp;