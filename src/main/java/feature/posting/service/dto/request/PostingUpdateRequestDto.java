package feature.posting.service.dto.request;

import feature.posting.domain.Posting;

public record PostingUpdateRequestDto(
        Long id,
        String title,
        String content
) {

    public Posting toPosting() {
        return new Posting(
                this.id,
                this.title,
                this.content
        );
    }

}
