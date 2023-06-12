import org.campusmolndal.WeatherAPI;
import org.campusmolndal.WeatherForecast;
import org.campusmolndal.WeatherService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class WeatherServiceTest {
    private WeatherAPI weatherAPIMock;
    private WeatherService weatherService;

    @BeforeEach
    void setup() {
        weatherAPIMock = mock(WeatherAPI.class);
        weatherService = new WeatherService(weatherAPIMock);
    }

    @Test
    void testGetWeatherData() {
        // Arrange
        WeatherForecast forecast = new WeatherForecast("Stockholm", "20", false);
        when(weatherAPIMock.getWeatherData(forecast)).thenReturn("Mocked Weather Data");

        // Act
        String result = weatherAPIMock.getWeatherData(forecast);

        // Assert
        assertEquals("Mocked Weather Data", result);
        verify(weatherAPIMock, times(1)).getWeatherData(forecast);
    }

    @Test
    void testGetWeatherDataWithEmptyResponse() {
        // Arrange
        WeatherForecast forecast = new WeatherForecast("Gothenburg", "25", true);
        when(weatherAPIMock.getWeatherData(forecast)).thenReturn("");

        // Act
        String result = weatherAPIMock.getWeatherData(forecast);

        // Assert
        assertEquals("", result);
        verify(weatherAPIMock, times(1)).getWeatherData(forecast);
    }

    @Test
    void testGetWeatherDataWithNullResponse() {
        // Arrange
        WeatherForecast forecast = new WeatherForecast("Malmo", "15", true);
        when(weatherAPIMock.getWeatherData(forecast)).thenReturn(null);

        // Act
        String result = weatherAPIMock.getWeatherData(forecast);

        // Assert
        assertNull(result);
        verify(weatherAPIMock, times(1)).getWeatherData(forecast);
    }

    @Test
    void testGetWeatherDataWithException() {
        // Arrange
        WeatherForecast forecast = new WeatherForecast("Uppsala", "10", true);
        when(weatherAPIMock.getWeatherData(forecast)).thenThrow(new RuntimeException("API Exception"));

        // Act & Assert
        assertThrows(RuntimeException.class, () -> weatherAPIMock.getWeatherData(forecast));
        verify(weatherAPIMock, times(1)).getWeatherData(forecast);
    }
}
