import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArtworkTest {

    Artwork artwork;
    Artist artist;
    Price price;
    Nft nft;

    @BeforeEach
    public void setUp() {
        artwork = new Artwork ("Mona Lisa", "Leonardo", 50, 100);
    }

    @Test
    public void hasTitle(){
        assertThat(artwork.getTitle()).isEqualTo("Mona Lisa");
    }
    @Test
    public void hasArtist() {
        assertThat(artwork.getArtist()).isEqualTo("Leonardo");
    }
    @Test
    public void hasPrice() {
        assertThat(artwork.getPrice()).isEqualTo(50);
    }
    @Test
    public void hasNft() {
        assertThat(artwork.getNft()).isEqualTo(100);
    }
}
