import exceptions.SecretException;
import reactor.core.publisher.Mono;

public interface GenericManagerAsync {
    Mono<String> getSecret(String secretName) throws SecretException;
    <T> Mono<T> getSecret(String secretName, Class<T> cls) throws SecretException;
}
