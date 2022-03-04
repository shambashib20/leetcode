class Solution {
    
    public double champagneTower(int poured, int query_row, int query_glass) {
        List<Double> previousLevel = new ArrayList<>();
        previousLevel.add(poured * 1.0d);
        int curr_row = 1;
        
        while(curr_row <= query_row){
            List<Double> currLevel = new ArrayList<>();
			// current level will have 1 more glass than the previous level
            for(int i=0; i<previousLevel.size()+1; i++){
                currLevel.add(0.0d);
            }
            
            for(int i=0; i<previousLevel.size(); i++){
                if(previousLevel.get(i) > 1.0d){
                    double quantityRemaining = (previousLevel.get(i)-1.0d)/2;
                    currLevel.set(i, quantityRemaining + currLevel.get(i));
                    currLevel.set(i+1, quantityRemaining + currLevel.get(i+1));
                }
            }
            
			// current level becomes the previous level for the next level
            previousLevel = currLevel;
            curr_row++;
        }
        
        return Math.min(previousLevel.get(query_glass), 1);
    }
    
}