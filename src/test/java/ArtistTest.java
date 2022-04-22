import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

    public class ArtistTest {

        Artist artist;
        Artwork artwork;

        @BeforeEach
        public void setUp(){
            artist = new Artist ("Leonardo");
            artwork = new  Artwork ("Mona Lisa");
        }

        @Test
        public void hasName(){

            assertThat(artist.getName()).isEqualTo("John");

        }

        @Test
        public void canGetArtwork(){
            assertThat(artist.getArtwork()).isEqualTo("Mona Lisa");
        }

    }

