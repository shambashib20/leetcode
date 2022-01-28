class Trie {
    Node n = new Node();
    public Trie() {
        
    }
    
    public void insert(String word) {
        Node pointer = n;
        for(int i=0;i<word.length();i++){
            if(pointer.map.containsKey(word.charAt(i))){
                pointer = pointer.map.get(word.charAt(i));
            }
            else{
                Node childNode = new Node();
                pointer.map.put(word.charAt(i), childNode);
                pointer = childNode;
            }
        }
        pointer.isTail = true;
    }
    
    public boolean search(String word) {
        Node pointer = n;
        for(int i=0;i<word.length();i++){
            if(!pointer.map.containsKey(word.charAt(i)))
                return false;
            pointer = pointer.map.get(word.charAt(i));
        }
        return pointer.isTail;
    }
    
    public boolean startsWith(String prefix) {
        Node pointer = n;
        for(int i=0;i<prefix.length();i++){
            if(!pointer.map.containsKey(prefix.charAt(i)))
                return false;
            pointer = pointer.map.get(prefix.charAt(i));
        }
        return true;
    }
}

class Node{
    public boolean isTail = false;
    public HashMap<Character, Node> map = new HashMap<>();
    
}
/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */