package mikufan.cx.vocadbapiclientfixer.model

import java.nio.file.Path

/**
 * @date 2021-05-17
 * @author CX无敌
 */
data class FixInfo(val originalClassFile: Path, val `package`: String, val enums: List<String>)
