package jp.kaleidot725.orbit.ui.organisms

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import jp.kaleidot725.orbit.data.entity.PokemonDetails
import jp.kaleidot725.orbit.ui.SAMPLE_POKEMON_DETAILS_LIST
import jp.kaleidot725.orbit.ui.molecules.pokemon.PokemonRevolution

@Composable
fun PokemonRevolutions(details: List<PokemonDetails>, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(text = "Revolution", style = MaterialTheme.typography.h6)

        Spacer(modifier = Modifier.height(8.dp))

        Column {
            details.forEach {
                PokemonRevolution(details = it)

                Spacer(modifier = Modifier.height(8.dp))
            }
        }
    }
}

@Preview
@Composable
private fun PokemonRevolutions_Preview() {
    PokemonRevolutions(SAMPLE_POKEMON_DETAILS_LIST)
}