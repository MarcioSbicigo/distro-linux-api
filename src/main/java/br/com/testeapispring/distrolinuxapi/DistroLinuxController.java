package br.com.testeapispring.distrolinuxapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DistroLinuxController {

    private List<DistroLinux> mostPopularDistros =
            List.of(
                    new DistroLinux("MX Linux", "https://distrowatch.com/images/yvzhuwbpy/mx.png", 1),
                    new DistroLinux("EndeavourOS", "https://distrowatch.com/images/yvzhuwbpy/endeavour.png", 2),
                    new DistroLinux("Mint", "https://distrowatch.com/images/yvzhuwbpy/mint.png", 3),
                    new DistroLinux("Manjaro", "https://distrowatch.com/images/yvzhuwbpy/manjaro.png", 4),
                    new DistroLinux("Pop!_OS", "https://distrowatch.com/images/yvzhuwbpy/popos.png", 5),
                    new DistroLinux("Fedora", "https://distrowatch.com/images/yvzhuwbpy/fedora.png", 6),
                    new DistroLinux("Ubuntu", "https://distrowatch.com/images/yvzhuwbpy/ubuntu.png", 7),
                    new DistroLinux("Debian", "https://distrowatch.com/images/yvzhuwbpy/debian.png", 8),
                    new DistroLinux("Lite", "https://distrowatch.com/images/yvzhuwbpy/lite.png", 9),
                    new DistroLinux("Garuda", "https://distrowatch.com/images/yvzhuwbpy/garuda.png", 10),
                    new DistroLinux("openSUSE", "https://distrowatch.com/images/yvzhuwbpy/opensuse.png", 11),
                    new DistroLinux("Zorin", "https://distrowatch.com/images/yvzhuwbpy/zorin.png", 12),
                    new DistroLinux("elementary", "https://distrowatch.com/images/yvzhuwbpy/elementary.png", 13),
                    new DistroLinux("KDE neon", "https://distrowatch.com/images/yvzhuwbpy/kdeneon.png", 14),
                    new DistroLinux("antiX", "https://distrowatch.com/images/yvzhuwbpy/antix.png", 15),
                    new DistroLinux("AlmaLinux", "https://distrowatch.com/images/yvzhuwbpy/alma.png", 16),
                    new DistroLinux("Kali", "https://distrowatch.com/images/yvzhuwbpy/kali.png", 17),
                    new DistroLinux("PCLinuxOS", "https://distrowatch.com/images/yvzhuwbpy/pclinuxos.png", 18),
                    new DistroLinux("ArcoLinux", "https://distrowatch.com/images/yvzhuwbpy/arco.png", 19),
                    new DistroLinux("Puppy", "https://distrowatch.com/images/yvzhuwbpy/puppy.png", 20)
            );

    @GetMapping("/most-popular-distros")
    public List<DistroLinux> obterDistrosLinux() {
        return mostPopularDistros;
    }
}