/*
 * Copyright (c) 2019 Connexta, LLC
 *
 * Released under the GNU Lesser General Public License version 3; see
 * https://www.gnu.org/licenses/lgpl-3.0.html
 */
/* Default Package */
class SpotlessConfig {

    static Closure getMisc() {
        return {
            target "**/*.md", "**/.gitignore"

            trimTrailingWhitespace()
            indentWithSpaces(4)
            endWithNewline()
        }
    }

    static Closure getJava(File license) {
        return {
            licenseHeaderFile license
            removeUnusedImports()
            googleJavaFormat()
            trimTrailingWhitespace()
        }
    }

    static Closure getGroovy(File license) {
        return {
            target "**/*.gradle", "**/*.groovy"

            licenseHeaderFile(license, "/\\* Build Script \\*/|/\\* Default Package \\*/")
            trimTrailingWhitespace()
            indentWithSpaces(4)
            endWithNewline()
        }
    }
}