import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void setRadioTest() { //выбор станции больше 9
        Radio rad = new Radio();
        rad.setCurrentRadio(10);

        int expected = 0;
        int actual = rad.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MoreRadioTest() {  //следующая после 9
        Radio rad = new Radio();

        rad.setCurrentRadio(9);
        rad.next();


        int expected = 0;
        int actual = rad.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lessRadioTest() {  //предыдущая после 0
        Radio rad = new Radio();

        rad.setCurrentRadio(-1);
        rad.prev();


        int expected = 9;
        int actual = rad.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioTest() {  //следующая станция
        Radio rad = new Radio();

        rad.setCurrentRadio(2);
        rad.next();


        int expected = 3;
        int actual = rad.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioTest() {  //предыдущая станция
        Radio rad = new Radio();

        rad.setCurrentRadio(5);
        rad.prev();


        int expected = 4;
        int actual = rad.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolimeTest() {  //повышение громкости
        Radio rad = new Radio();

        rad.setCurrentVolume(99);
        rad.IncreaseVolime();


        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void downVolimeTest() {  //понижение громкости
        Radio rad = new Radio();

        rad.setCurrentVolume(1);
        rad.downVolime();


        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseMaxVolimeTest() {  //повышение громкости выше 100
        Radio rad = new Radio();

        rad.setCurrentVolume(100);
        rad.IncreaseVolime();


        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void downMinVolimeTest() {  //понижение громкости ниже 0
        Radio rad = new Radio();

        rad.setCurrentVolume(0);
        rad.downVolime();


        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeMaxTest() { //выбор громкости больше 100
        Radio rad = new Radio();
        rad.setCurrentVolume(101);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeMinTest() { //выбор громкости меньше 0
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


}
