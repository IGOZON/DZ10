import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio rad = new Radio();


    @Test
    public void setMaxRadioTest() { //выбор станции больше 9


        rad.setCurrentRadio(11);

        int expected = 9;
        int actual = rad.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setMinRadioTest() { //выбор меньше 0

        rad.setCurrentRadio(-1);

        int expected = 0;
        int actual = rad.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MoreRadioTest() {  //следующая после 9

        rad.setCurrentRadio(9);
        rad.next();


        int expected = 0;
        int actual = rad.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lessRadioTest() {  //предыдущая после 0


        rad.setCurrentRadio(-1);
        rad.prev();


        int expected = 9;
        int actual = rad.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioTest() {  //следующая станция

        rad.setCurrentRadio(2);
        rad.next();


        int expected = 3;
        int actual = rad.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioTest() {  //предыдущая станция

        rad.setCurrentRadio(5);
        rad.prev();


        int expected = 4;
        int actual = rad.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void chooseMaxRadioTest() { //выбор минимальной и максимальной стации
        Radio rad = new Radio(15);

        rad.setCurrentRadio(20);

        int expected = 14;
        int actual = rad.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void chooseMinRadioTest() { //выбор минимальной и максимальной стации
        Radio rad = new Radio(20);

        rad.setCurrentRadio(-1);

        int expected = 0;
        int actual = rad.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolimeTest() {  //повышение громкости

        rad.setCurrentVolume(99);
        rad.IncreaseVolime();


        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void downVolimeTest() {  //понижение громкости

        rad.setCurrentVolume(1);
        rad.downVolime();


        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseMaxVolimeTest() {  //повышение громкости выше 100

        rad.setCurrentVolume(100);
        rad.IncreaseVolime();


        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void downMinVolimeTest() {  //понижение громкости ниже 0

        rad.setCurrentVolume(0);
        rad.downVolime();


        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeMaxTest() { //выбор громкости больше 100

        rad.setCurrentVolume(101);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeMinTest() { //выбор громкости меньше 0

        rad.setCurrentVolume(-1);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


}
