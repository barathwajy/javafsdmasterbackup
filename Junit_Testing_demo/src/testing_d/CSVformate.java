package testing_d;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


@DisplayName(value="shd pass")
public class CSVformate {

		@ParameterizedTest(name="[index]-> a={0},b={1},sum={2}")
		@CsvSource({"1,1,2","2,3,5"})
		public void sum(int a,int b, int sum)
		{
			Assertions.assertEquals(sum, a+b);
			
		}
}
