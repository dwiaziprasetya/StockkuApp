package com.example.stokkuai.presentation.ui.screen.auth.login

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.stokkuai.R
import com.example.stokkuai.presentation.theme.StokkuAITheme
import com.example.stokkuai.presentation.theme.poppinsFontFamily

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    LoginContent(
        username = "",
        password = "wakakaka",
        onUsernameChange = {},
        onPasswordChange = {},
        passwordVisibility = false,
        onPasswordVisibilityChange = {},
        onSignUpClick = {},
        onLoginClick = {},
        passwordError = false,
        onGuestClick = {}
    )
}

@Composable
fun LoginContent(
    username: String,
    password: String,
    onUsernameChange: (String) -> Unit,
    onPasswordChange: (String) -> Unit,
    passwordVisibility: Boolean,
    onPasswordVisibilityChange: () -> Unit,
    onSignUpClick: () -> Unit,
    onLoginClick: () -> Unit,
    onGuestClick: () -> Unit,
    passwordError: Boolean,
) {
    Column(
        modifier = Modifier
            .background(
                color = MaterialTheme.colorScheme.background
            )
            .padding(
                top = 100.dp,
                start = 32.dp,
                end = 32.dp
            )
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(R.string.welcome_back_1),
                fontFamily = poppinsFontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 35.sp
            )
            Text(
                text = stringResource(R.string.welcome_back_2),
                fontFamily = poppinsFontFamily,
                fontWeight = FontWeight.Light,
                fontSize = 16.sp
            )
        }

        Column(
            modifier = Modifier
                .padding(top = 32.dp)
        ) {
            CustomOutlinedTextField(
                value = username,
                hint = stringResource(R.string.enter_your_username),
                onValueChange = onUsernameChange,
                trailingIconResId = R.drawable.icon_email,
                onTrailingIconClick = {},
                isError = false,
                errorMessage = "",
                leadingIconResId = R.drawable.icon_email
            )
            CustomOutlinedTextField(
                value = password,
                hint = stringResource(R.string.enter_your_password),
                onValueChange = onPasswordChange,
                trailingIconResId = R.drawable.icon_visibility_off, // Sesuaikan dengan ikon visibility password
                onTrailingIconClick = { onPasswordVisibilityChange() },
                isError = passwordError,
                errorMessage = stringResource(R.string.error_password),
                visualTransformation = if (passwordVisibility) VisualTransformation.None
                else PasswordVisualTransformation(),
                leadingIconResId = R.drawable.icon_padlock,
            )
        }

        Text(
            text = stringResource(R.string.forgot_password),
            fontFamily = poppinsFontFamily,
            fontSize = 14.sp,
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier.padding(top = 8.dp).align(Alignment.End)
        )

        Button(
            modifier = Modifier
                .padding(top = 32.dp)
                .height(55.dp)
                .fillMaxWidth(),
            shape = RoundedCornerShape(10.dp),
            onClick = onLoginClick,
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.primary
            )
        ) {
            Text(
                fontFamily = poppinsFontFamily,
                text = stringResource(R.string.login),
                fontSize = 18.sp,
                color = MaterialTheme.colorScheme.background
            )
        }

        Row (
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(top = 48.dp)
                .fillMaxWidth()
        ){
            Divider(thickness = 1.dp, color = Color(0xFFE3E3E3), modifier = Modifier.weight(2f))
            Text(text = stringResource(R.string.or_continue_with))
            Divider(thickness = 1.dp, color = Color(0xFFE3E3E3), modifier = Modifier.weight(2f))
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 32.dp, vertical = 32.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(
                modifier = Modifier.height(60.dp).border(
                    color = MaterialTheme.colorScheme.outline,
                    width = 1.dp,
                    shape = RoundedCornerShape(40.dp)
                ),
                shape = RoundedCornerShape(40.dp),
                onClick = {},
                colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.background)
            ) {
                Icon(
                    painter = painterResource(R.drawable.icon_google),
                    contentDescription = "",
                    tint = Color.Unspecified
                )
            }
            Button(
                modifier = Modifier.height(60.dp).border(
                    color = MaterialTheme.colorScheme.outline,
                    width = 1.dp,
                    shape = RoundedCornerShape(40.dp)
                ),
                shape = RoundedCornerShape(40.dp),
                onClick = {},
                colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.background)
            ) {
                Icon(
                    painter = painterResource(R.drawable.icon_facebook),
                    contentDescription = "",
                    tint = Color.Unspecified
                )
            }
            Button(
                modifier = Modifier.height(60.dp).border(
                    color = MaterialTheme.colorScheme.outline,
                    width = 1.dp,
                    shape = RoundedCornerShape(40.dp)
                ),
                shape = RoundedCornerShape(40.dp),
                onClick = onGuestClick,
                colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.background)
            ) {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = "",
                    tint = Color.Unspecified
                )
            }
        }

        Row(
            modifier = Modifier.padding(top = 70.dp)
        ) {
            Text(
                text = stringResource(R.string.dont_have_account),
                fontFamily = poppinsFontFamily,
                fontSize = 14.sp,
                color = MaterialTheme.colorScheme.onPrimary
            )
            Text(
                text = " " + stringResource(R.string.sign_up),
                fontFamily = poppinsFontFamily,
                fontSize = 14.sp,
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier.clickable { onSignUpClick() }
            )
        }
    }
}


@Composable
fun CustomOutlinedTextField(
    value: String,
    onValueChange: (String) -> Unit,
    trailingIconResId: Int,
    onTrailingIconClick: () -> Unit,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    isError: Boolean,
    leadingIconResId: Int,
    errorMessage: String,
    hint: String = ""
) {
    val keyboardController = LocalSoftwareKeyboardController.current
    var isFocused by remember { mutableStateOf(false) }

    OutlinedTextField(
        shape = RoundedCornerShape(10.dp),
        colors = TextFieldDefaults.colors(
            focusedContainerColor = MaterialTheme.colorScheme.background,
            unfocusedContainerColor = MaterialTheme.colorScheme.background,
            disabledContainerColor = MaterialTheme.colorScheme.background,
            focusedIndicatorColor = MaterialTheme.colorScheme.primary,
            unfocusedIndicatorColor = Color(0xFFCAC8C8),
        ),
        value = value,
        onValueChange = onValueChange,
        placeholder =  {
            Text(
                text = hint,
                color = MaterialTheme.colorScheme.outline,
                fontFamily = poppinsFontFamily,
                fontSize = 15.sp
            )
        },
        leadingIcon = {
            Icon(
                painter = painterResource(leadingIconResId),
                contentDescription = null,
                tint = when {
                    isError -> MaterialTheme.colorScheme.error
                    isFocused -> MaterialTheme.colorScheme.primary
                    else -> MaterialTheme.colorScheme.onPrimary
                }
            )
        },
        keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Done),
        keyboardActions = KeyboardActions(onDone = {
            keyboardController?.hide()
        }),
        modifier = Modifier
            .padding(vertical = 8.dp)
            .fillMaxWidth()
            .onFocusChanged { isFocused = it.isFocused },
        trailingIcon = {
            Icon(
                painter = painterResource(trailingIconResId),
                contentDescription = null,
                tint = when {
                    isError -> MaterialTheme.colorScheme.error
                    isFocused -> MaterialTheme.colorScheme.primary
                    else -> MaterialTheme.colorScheme.onPrimary
                },
                modifier = Modifier.clickable { onTrailingIconClick() }
            )
        },
        visualTransformation = visualTransformation,
        textStyle = TextStyle(
            color = MaterialTheme.colorScheme.onPrimary,
            fontFamily = poppinsFontFamily,
            fontSize = 14.sp
        ),
        isError = isError,
        supportingText = {
            if (isError) {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = errorMessage,
                    color = MaterialTheme.colorScheme.error
                )
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
private fun LoginContentPreview() {
    StokkuAITheme(
        dynamicColor = false
    ) {
        LoginContent(
            username = "",
            password = "",
            onUsernameChange = {},
            onPasswordChange = {},
            passwordVisibility = true,
            onPasswordVisibilityChange = {},
            onSignUpClick = {},
            onLoginClick = {},
            passwordError = true,
            onGuestClick = {},
        )
    }
}