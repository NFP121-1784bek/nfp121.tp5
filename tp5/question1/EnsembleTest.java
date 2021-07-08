package question1;

public class EnsembleTest extends junit.framework.TestCase {

    public void testUnion() {
        question1.Ensemble<Integer> e1, e2;
        e1 = new question1.Ensemble<Integer>();
        assertEquals(true, e1.add(2));
        assertEquals(true, e1.add(3));

        e2 = new question1.Ensemble<Integer>();
        assertEquals(true, e2.add(3));
        assertEquals(true, e2.add(4));

        question1.Ensemble<Integer> union = e1.union(e2);
        assertEquals(3, union.size());
        assertTrue(union.contains(2));
        assertTrue(union.contains(3));
        assertTrue(union.contains(4));
    }
    
    public void testAdd(){
        question1.Ensemble<Integer> test_Ensemble_1;
        test_Ensemble_1 = new question1.Ensemble<Integer>();
        test_Ensemble_1.add(2);
        assertEquals(1,test_Ensemble_1.size());
        assertTrue(test_Ensemble_1.contains(2));
        
    }
    
    public void testMon_Union_Test(){
        question1.Ensemble<Integer> e1;
        question1.Ensemble<Integer> e2;
        
        
        e1 = new question1.Ensemble<Integer>();
        e2 = new question1.Ensemble<Integer>();
        
        e1.add(4);
        e1.add(1);
        e1.add(6);
        e1.add(9);
        e1.add(100);
        
        e2.add(6);
        e2.add(2);
        e2.add(8);
        e2.add(100);
        
        question1.Ensemble<Integer> union = e1.union(e2);
        
        assertEquals(7,union.size());
        
        for(int num : new int[]{1,2,4,6,8,9,100}){
            assertTrue(union.contains(num));
        }
    }
    
    public void testIntersection(){
        question1.Ensemble<Integer> e1;
        question1.Ensemble<Integer> e2;
        
        
        e1 = new question1.Ensemble<Integer>();
        e2 = new question1.Ensemble<Integer>();
        
        e1.add(4);
        e1.add(1);
        e1.add(6);
        e1.add(9);
        e1.add(100);
        
        e2.add(6);
        e2.add(2);
        e2.add(8);
        e2.add(100);
        
        question1.Ensemble<Integer> intersect = e1.inter(e2);
        assertEquals(2,intersect.size());
        for(int num : new int[]{6,100}){
            assertTrue(intersect.contains(num));
        }
    }
    
    public void testDifference(){
        question1.Ensemble<Integer> e1;
        question1.Ensemble<Integer> e2;
        
        
        e1 = new question1.Ensemble<Integer>();
        e2 = new question1.Ensemble<Integer>();
        
        e1.add(4);
        e1.add(1);
        e1.add(6);
        e1.add(9);
        e1.add(100);
        
        e2.add(6);
        e2.add(2);
        e2.add(8);
        e2.add(100);
        
        question1.Ensemble<Integer> diff = e1.diff(e2);
        assertEquals(3,diff.size());
        for(int num : new int[]{1,4,9}){
            assertTrue(diff.contains(num));
        }
    
    
    }
    
    public void testDifferenceSym(){
        question1.Ensemble<Integer> e1;
        question1.Ensemble<Integer> e2;
        
        
        e1 = new question1.Ensemble<Integer>();
        e2 = new question1.Ensemble<Integer>();
        
        e1.add(4);
        e1.add(1);
        e1.add(6);
        e1.add(9);
        e1.add(100);
        
        e2.add(6);
        e2.add(2);
        e2.add(8);
        e2.add(100);
        
        question1.Ensemble<Integer> diffSym = e1.diffSym(e2);
        assertEquals(5,diffSym.size());
        
        for(int num : new int[]{1,2,4,8,9}){
            assertTrue(diffSym.contains(num));
        }
    
    
    }
    
    
}
