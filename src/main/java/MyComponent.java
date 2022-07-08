import dagger.Component;
import dagger.Lazy;

@Component
interface MyComponent {
    Lazy<Library> getLibrary();
}
