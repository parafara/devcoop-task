package feature.posting.service.dto.request;

import feature.posting.domain.Posting;

public record PostingCreateRequestDto(
        String title,
        String content
) {

    public Posting toPosting() {
        return new Posting(
                null,
                this.title,
                this.content
        );
    }

}
