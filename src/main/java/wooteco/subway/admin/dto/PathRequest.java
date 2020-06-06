package wooteco.subway.admin.dto;

import wooteco.subway.admin.domain.PathType;

public class PathRequest {
    private Long source;
    private Long target;
    private PathType type;

    public PathRequest() {
    }

    public PathRequest(Long source, Long target, PathType type) {
        this.source = source;
        this.target = target;
        this.type = type;
    }

    public Long getSource() {
        return source;
    }

    public Long getTarget() {
        return target;
    }

    public PathType getType() {
        return type;
    }
}
