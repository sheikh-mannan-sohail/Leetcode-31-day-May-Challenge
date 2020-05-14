
class TrieNode{
    
    char c;
    boolean is_key = false;
    TrieNode[] alphabet_references = new TrieNode[26] ;
    
    
    TrieNode(){
        c = 0;
    }
    
}

class Trie {    
    TrieNode root;
    
        /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode curr = root;
        for( Character c : word.toCharArray()){
            if(curr.alphabet_references[c-'a'] == null){
                TrieNode  node = new  TrieNode();
                node.c = c;
                curr.alphabet_references[c-'a']  =   node;
            }
            curr = curr.alphabet_references[c-'a'];
        }

        curr.is_key = true;
        
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode curr = root;
                
        for(Character c : word.toCharArray()){
            if(curr==null  ||  curr.alphabet_references[c-'a'] == null) return false;
            else
                curr = curr.alphabet_references[c-'a'];
            
        }
             
        if(curr.is_key)  return true;
        return false;
        
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        
        TrieNode curr = root;
        
        for(Character c :  prefix.toCharArray()){
            if(curr==null  || curr.alphabet_references[c-'a'] == null)return false;
            else
                curr = curr.alphabet_references[c- 'a'] ;
            
        }
        
        return true;
        
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */