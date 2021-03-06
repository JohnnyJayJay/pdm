package me.bristermitten.pdmlibs.artifact;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Set;

public class ArtifactDTO
{

    @NotNull
    private final String groupId;
    @NotNull
    private final String artifactId;
    @NotNull
    private final String version;

    @NotNull
    @SerializedName("repository")
    private final String repositoryAlias;

    @Nullable
    private final Set<ArtifactDTO> transitive;

    public ArtifactDTO(@NotNull String groupId, @NotNull String artifactId, @NotNull String version, @NotNull String sourceRepository, @Nullable Set<ArtifactDTO> transitive)
    {
        this.groupId = groupId;
        this.artifactId = artifactId;
        this.version = version;
        this.repositoryAlias = sourceRepository;
        this.transitive = transitive;
    }

    @NotNull
    public String getGroupId()
    {
        return groupId;
    }

    @NotNull
    public String getArtifactId()
    {
        return artifactId;
    }

    @NotNull
    public String getVersion()
    {
        return version;
    }

    @NotNull
    public String getRepositoryAlias()
    {
        return repositoryAlias;
    }

    @Nullable
    public Set<ArtifactDTO> getTransitive()
    {
        return transitive;
    }
}
