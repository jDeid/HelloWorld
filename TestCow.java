
import java.time.LocalDate;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sistemagranja.Cow;


public class TestCow {
             Cow []vaca=new Cow[5];
             
             int []expectedId=new int[5];
             int []actualId=new int[5];
             String []expectedNombre={"maria","eugenia","juana","lucia","andrea"};
             String []actualNombre=new String[5];
             boolean []expectedEstado=new boolean[5];
             boolean []actualEstado=new boolean[5];
             Date []expectedBornOn=new Date[5];
             Date []actualBornOn=new Date[5];
    public TestCow() {
              for(int i=0;i<5;i++){
                  vaca[i]=new Cow();
              }
             for(int i=0;i<5;i++){
                 expectedId[i]=i+1;
                 actualId[i]=0;
                 actualNombre[i]=" ";
                 actualEstado[i]= false;
                 expectedEstado[i]=true;
                 actualBornOn[i]=new Date(0,0,0);
                 expectedBornOn[i]=new Date(116,i+5,i+12);
   
    }
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
        
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void TestPruebaCow(){
        for(int i=0;i<5;i++){
            vaca[i].setId(i+1);
            vaca[i].setOrdeniar(true);
            vaca[i].setBornOn(new Date(116,i+5,i+12));
            
        }
        vaca[0].setNombre("maria");
        vaca[1].setNombre("eugenia");
        vaca[2].setNombre("juana");
        vaca[3].setNombre("lucia");
        vaca[4].setNombre("andrea");
        
        for(int i=0;i<5;i++){
           actualId[i]=vaca[i].getId();
           actualNombre[i]=vaca[i].getNombre();
           actualEstado[i]=vaca[i].isOrdeniar();
           actualBornOn[i]=vaca[i].getBornOn();
        }
        
        
        for(int i=0;i<5;i++){
            assertEquals(expectedId[i], actualId[i]);
            assertEquals(expectedNombre[i], actualNombre[i]);
            assertEquals(expectedEstado[i], actualEstado[i]);
            assertEquals(expectedBornOn[i], actualBornOn[i]);
            System.out.println("Vaca "+(i+1)+" pasada");
           
        }
        
    }
}
