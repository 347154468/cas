package org.apereo.cas.oidc.dynareg;

import lombok.extern.slf4j.Slf4j;
import org.apereo.cas.util.serialization.AbstractJacksonBackedStringSerializer;

/**
 * This is {@link OidcClientRegistrationRequestSerializer}.
 *
 * @author Misagh Moayyed
 * @since 5.1.0
 */
@Slf4j
public class OidcClientRegistrationRequestSerializer extends AbstractJacksonBackedStringSerializer<OidcClientRegistrationRequest> {
    private static final long serialVersionUID = -4029907481854505324L;

    @Override
    protected Class<OidcClientRegistrationRequest> getTypeToSerialize() {
        return OidcClientRegistrationRequest.class;
    }

    @Override
    protected boolean isDefaultTypingEnabled() {
        return false;
    }
}
